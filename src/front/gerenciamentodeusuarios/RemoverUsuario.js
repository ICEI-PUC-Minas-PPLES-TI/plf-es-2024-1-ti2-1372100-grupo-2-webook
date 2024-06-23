const apiUrl = 'http://localhost:8080/usuario';

async function fetchUsuarios() {
    try {
        const response = await fetch(apiUrl);
        const data = await response.json();

        const usuariosTable = document.getElementById('usuarios-table');
        const tbody = usuariosTable.getElementsByTagName('tbody')[0];
        tbody.innerHTML = '';

        data.forEach(usuario => {
            const newRow = document.createElement('tr');
            newRow.innerHTML = `
                        <td>${usuario.id}</td>
                        <td>${usuario.nome}</td>
                        <td>${usuario.cpf}</td>
                        <td>${usuario.dataNascimento}</td>
                        <td>
                            <button class="edit-button" onclick="editarUsuario(${usuario.id})">Editar</button>
                            <button class="delete-button" onclick="confirmarRemoverUsuario(${usuario.id})">Remover</button>
                        </td>
                    `;
            tbody.appendChild(newRow);
        });
    } catch (error) {
        console.error('Erro ao buscar usuários:', error);
    }
}

async function buscarUsuario() {
    const cpf = document.getElementById('searchInput').value;

    try {
        const response = await fetch(`${apiUrl}/cpf/${cpf}`);
        if (!response.ok) {
            throw new Error('Usuário não encontrado');
        }

        const usuario = await response.json();

        const usuariosTable = document.getElementById('usuarios-table');
        const tbody = usuariosTable.getElementsByTagName('tbody')[0];
        tbody.innerHTML = '';

        const newRow = document.createElement('tr');
        newRow.innerHTML = `
                    <td>${usuario.id}</td>
                    <td>${usuario.nome}</td>
                    <td>${usuario.cpf}</td>
                    <td>${usuario.dataNascimento}</td>
                    <td>
                        <button class="edit-button" onclick="editarUsuario(${usuario.id})">Editar</button>
                        <button class="delete-button" onclick="confirmarRemoverUsuario(${usuario.id})">Remover</button>
                    </td>
                `;
        tbody.appendChild(newRow);
    } catch (error) {
        console.error('Erro ao buscar usuário:', error);
    }
}

async function removerUsuario(id) {
    try {
        const requestOptions = {
            method: 'DELETE'
        };
        const response = await fetch(`${apiUrl}/${id}`, requestOptions);
        if (!response.ok) {
            const errorMessage = await response.text();
            throw new Error(`Erro ao remover usuário: ${errorMessage}`);
        }
        console.log('Usuário removido com sucesso');

        fetchUsuarios();
    } catch (error) {
        console.error(error.message);
    }
}

function confirmarRemoverUsuario(id) {
    if (confirm("Tem certeza de que deseja remover este usuário?")) {
        removerUsuario(id);
    }
}

async function editarUsuario(id) {
    window.location.href = `/webook/src/front/gerenciamentodeusuarios/AlterarUsuario.html?id=${id}`;
}

window.onload = fetchUsuarios;
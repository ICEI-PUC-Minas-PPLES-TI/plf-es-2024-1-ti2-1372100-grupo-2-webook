const apiUrl = 'http://localhost:8080/livro';

async function fetchLivros() {
    try {
        const response = await fetch(apiUrl);
        const data = await response.json();

        const livrosTable = document.getElementById('livros-table');
        const tbody = livrosTable.getElementsByTagName('tbody')[0];
        tbody.innerHTML = '';

        data.forEach(livro => {
            if (livro.disponivel) {
                const newRow = document.createElement('tr');
                newRow.innerHTML = `
                            <td>${livro.id}</td>
                            <td>${livro.tituloLivro}</td>
                            <td>${livro.autor}</td>
                            <td>${livro.isbn}</td>
                            <td>${livro.editora}</td> 
                            <td>${livro.secao}</td>
                            <td>${livro.preco}$</td>
                            <td>
                                <button class="edit-button" onclick="emprestarLivro(${livro.id})">Emprestar</button>
                            </td>
                        `;
                tbody.appendChild(newRow);
            }
        });
    } catch (error) {
        console.error('Erro ao buscar livros:', error);
    }
}

async function buscarLivro() {
    const isbn = document.getElementById('searchInput').value;

    try {
        const response = await fetch(`${apiUrl}/${isbn}`);
        if (!response.ok) {
            throw new Error('Livro não encontrado');
        }

        const livro = await response.json();

        const livrosTable = document.getElementById('livros-table');
        const tbody = livrosTable.getElementsByTagName('tbody')[0];
        tbody.innerHTML = '';

        if (livro.disponivel) {
            const newRow = document.createElement('tr');
            newRow.innerHTML = `
                        <td>${livro.id}</td>
                        <td>${livro.tituloLivro}</td>
                        <td>${livro.autor}</td>
                        <td>${livro.isbn}</td>
                        <td>${livro.editora}</td>
                        <td>${livro.secao}</td>
                        <td>${livro.preco}$</td>
                        <td>
                            <button class="edit-button" onclick="emprestarLivro(${livro.id})">Emprestar</button>
                        </td>
                    `;
            tbody.appendChild(newRow);
        }
    } catch (error) {
        console.error('Erro ao buscar livro:', error);
    }
}

async function emprestarLivro(id) {
    window.location.href = `/webook/src/front/processodeemprestimo/emprestarLivro.html?id=${id}`;
}

window.onload = fetchLivros;
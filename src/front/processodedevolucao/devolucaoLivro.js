const apiUrl = 'http://localhost:8080/emprestimo';

async function fetchLivrosDevolucao() {
    try {
        const response = await fetch(apiUrl);
        const data = await response.json();
        console.log('Dados recebidos da API:', data);

        const livrosTable = document.getElementById('livros-table');
        const tbody = livrosTable.getElementsByTagName('tbody')[0];
        tbody.innerHTML = '';

        for (const emprestimo of data) {
            if (!emprestimo.dataDevolucao) {
                const newRow = document.createElement('tr');
                newRow.innerHTML = `
                            <td>${emprestimo.id}</td>
                            <td>${emprestimo.dataEmprestimo.join('/')}</td>
                            <td>Não devolvido</td>
                            <td>
                                <button class="edit-button" onclick="devolverLivro(${emprestimo.id})">Devolver</button>
                            </td>
                            <td>
                                ${emprestimo.danificado ? 'Livro devolvido com defeito' : `<button class="delete-button" onclick="reportarLivroDanificado(${emprestimo.id}, ${emprestimo.idLivro})">Reportar Livro Danificado</button>`}
                            </td>
                        `;
                tbody.appendChild(newRow);
            }
        }

        if (tbody.innerHTML === '') {
            console.log('Nenhum livro encontrado para devolução.');
        }
    } catch (error) {
        console.error('Erro ao buscar livros:', error);
    }
}

async function devolverLivro(id) {
    try {
        const response = await fetch(`${apiUrl}/devolver/${id}`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                dataDevolucao: new Date().toISOString().split('T')[0]
            })
        });
        location.reload(true);
        if (response.ok) {
            const livroResponse = await fetch(`http://localhost:8080/livro/${id}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    disponibilidade: 1
                })
            });

            if (livroResponse.ok) {
                alert('Empréstimo devolvido com sucesso e disponibilidade do livro atualizada!');
                location.reload(true);
            } else {
                throw new Error('Erro ao atualizar a disponibilidade do livro');
            }
        } else {
            throw new Error('Erro ao devolver empréstimo');
        }
    } catch (error) {
        console.error('Erro ao devolver empréstimo:', error);
    }
}

async function reportarLivroDanificado(id) {
    try {
        const taxaExtraInput = prompt("Informe a taxa extra:");
        const motivoTaxaInput = prompt("Informe o motivo da taxa:");

        if (taxaExtraInput === null || motivoTaxaInput === null || taxaExtraInput.trim() === '' || motivoTaxaInput.trim() === '') {
            alert("Informe a taxa extra e o motivo da taxa para prosseguir.");
            return;
        }

        const taxaExtra = parseFloat(taxaExtraInput.replace(',', '.'));
        const motivoTaxa = motivoTaxaInput.trim();

        if (isNaN(taxaExtra)) {
            alert("A taxa extra deve ser um número válido.");
            return;
        }

        const response = await fetch(`${apiUrl}/devolver/${id}`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                dataDevolucao: new Date().toISOString().split('T')[0],
                taxaExtra: taxaExtra,
                motivoTaxa: motivoTaxa
            })
        });

        if (response.ok) {
            alert('Livro danificado registrado com sucesso!');
            location.reload();
        } else {
            throw new Error('Erro ao registrar livro danificado');
        }
    } catch (error) {
        console.error('Erro ao registrar livro danificado:', error);
    }
}


window.onload = fetchLivrosDevolucao;
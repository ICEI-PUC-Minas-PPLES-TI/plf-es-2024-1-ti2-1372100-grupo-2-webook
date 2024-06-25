async function fetchAndDisplayData() {
    try {
        const responsePDA = await fetch('http://localhost:8080/emprestimo/PDA');
        const dataPDA = await responsePDA.json();

        const responsePLD = await fetch('http://localhost:8080/emprestimo/PLD');
        const dataPLD = await responsePLD.json();

        const responsePIE = await fetch('http://localhost:8080/emprestimo/PIE');
        const dataPIE = await responsePIE.json();

        if (dataPDA || dataPLD || dataPIE) {
            displayChartPDA(dataPDA);
            displayChartPLD(dataPLD);
            displayChartPIE(dataPIE);
        } else {
            console.log('Não há dados disponíveis para exibir.');
        }
    } catch (error) {
        console.error('Erro ao buscar dados:', error);
    }
}

function displayChartPDA(percentual) {
    const ctx = document.getElementById('chartPDA').getContext('2d');
    const chart = new Chart(ctx, {
        type: 'doughnut',
        data: {
            labels: ['Devoluções Atrasadas', 'Devoluções no Prazo'],
            datasets: [{
                data: [percentual, 100 - percentual],
                backgroundColor: [
                    'rgba(0, 0, 0, 0.1)',
                    'rgb(192, 211, 230)',
                ],
            }]
        },
    });
}

function displayChartPLD(percentual) {
    const ctx = document.getElementById('chartPLD').getContext('2d');
    const chart = new Chart(ctx, {
        type: 'doughnut',
        data: {
            labels: ['Livros Danificados', 'Livros Não Danificados'],
            datasets: [{
                data: [percentual, 100 - percentual],
                backgroundColor: [
                    'rgba(0, 0, 0, 0.1)',
                    'rgb(192, 211, 230)',
                ],
            }]
        },
    });
}

function displayChartPIE(proporcao) {
    const ctx = document.getElementById('chartPIE').getContext('2d');
    const chart = new Chart(ctx, {
        type: 'doughnut',
        data: {
            labels: ['Itens no Acervo ', 'Itens Indisponiveis'],
            datasets: [{
                data: [proporcao, 100 - proporcao],
                backgroundColor: [
                    'rgba(0, 0, 0, 0.1)',
                    'rgb(192, 211, 230)',
                ],
            }]
        },
    });
}

fetchAndDisplayData();
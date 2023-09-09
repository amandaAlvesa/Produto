function Tabela({vetor}){
    return(
        <table className="table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nome</th>
                    <th>Marca</th>
                    <th>Preço</th>
                    <th>Selecionar</th>
                </tr>
            </thead>

            <tbody>
              {
                vetor.map((obj, indice) => (
                <tr key={indice}>
                    <td>{indice+1}</td>
                    <td>{obj.name} </td>
                    <td>{obj.marca}</td>
                    <td>{obj.preco}</td>
                    <td className="btn btn-success">Selecionar</td>
                </tr>
                ))
              }
            </tbody>
        </table>
    )
}

export default Tabela;
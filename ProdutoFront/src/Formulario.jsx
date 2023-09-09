function Formulario({botao, eventoTeclado}){
    return(
        <form> 
            <input type="text" onChange={eventoTeclado} name="name" placeholder="Nome" className="form-control"/>
            <input type="text" onChange={eventoTeclado} name="marca" placeholder="Marca" className="form-control"/>
            <input type="text" onChange={eventoTeclado} name="preco" placeholder="Preço" className="form-control"/>

            {
                botao
                ?                
                <input type="button" value="Cadastrar" className="btn btn-primary"/>
                :
                <div> 
                    <input type="button" value="Cancelar" className="btn btn-warning"/>
                    <input type="button" value="Alterar" className="btn btn-secondary"/>
                    <input type="button" value="Excluir" className="btn btn-danger"/>
                </div>    
            }
        </form>
    )    
}

export default Formulario;
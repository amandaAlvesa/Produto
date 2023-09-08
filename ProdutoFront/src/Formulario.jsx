function Formulario(){
    return(
        <form>
            <input type="text" placeholder="Nome"/>
            <input type="text" placeholder="Marca"/>
            <input type="text" placeholder="Preço"/>

            <input type="button" value="Cadastrar"/>
            <input type="button" value="Cancelar"/>
            <input type="button" value="Excluir"/>
            <input type="button" value="Alterar"/>
        </form>
    )    
}

export default Formulario;
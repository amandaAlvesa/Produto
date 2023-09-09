import { useEffect, useState } from 'react'
import './App.css'
import Formulario from './Formulario'
import Tabela from './Tabela'

function App() {

  const produto={
    codigo:0,
    name:'',
    marca:'',
    preco:''
  }

  const [btnCadastrar, setBtnCadastrar] = useState(true);
  const [produtos, setProdutos] =useState([]);
  const [objProduto, setObjProduto] = useState(produto);

  useEffect(() => {
    fetch("http://localhost:5050/listar")
    .then(retorno => retorno.json())
    .then(retorno_convertido => setProdutos(retorno_convertido));
  }, []);

  //obtrndo dados do formulario
  const aoDigitar = (e) =>{
    setObjProduto({...objProduto, [e.target.name] : e.target.value}); 
    }

  //cadastrar produto no back

  
  return (
   <div>
      <Formulario botao = {btnCadastrar} eventoTeclado={aoDigitar}/>
      <Tabela vetor={produtos} />
    </div>
  )
}

export default App

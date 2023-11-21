  import './App.css';
  import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
  import Joueur from "./Component/page/Joueur";
  import Body from './Component/Body/Body';
  import Footer from './Component/Footer/Footer';
  function App() {
    return (
      <Router>
        <Routes>
          <Route path="/" element={<Body />} />
          <Route path="/joueur" element={<Joueur />} />
        </Routes>
        <Footer />
      </Router>
      
    );
  }

  export default App;

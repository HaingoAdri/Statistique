import React from "react";
import style1 from "../css/bootstrap.min.css";
import { Link } from 'react-router-dom';
import style from "./Body.css";

class Body extends React.Component {
    render() {
      return (
        <body>
            <main>
            <div class="container">
                <div class="d-flex justify-content-left align-items-left" >
                    <ul class="nav p-4">
                        
                        <li class="nav-item aa">
                            <Link to="/" class="btn btn-outline-primary w-350" aria-current="page">Retour</Link>
                        </li>
                    </ul>
                </div>
                <div class="d-flex justify-content-center align-items-center" id="equite">
                    <div class="card p-5 w-100  shadow-sm  d-flex flex-column">
                        <div class="card-header bg-transparent">
                            <h4 class ="text-primary" >Liste Joueur de l'équipe ...:</h4>
                        </div>
                        <p></p>
                        <div class="card-body flex-grow-1 d-flex flex-column">
                            <table class="table">
                                <thead class="table-primary">
                                    <tr>
                                        <th scope="col">Joueur</th>
                                        <th scope="col">MJ</th>
                                        <th scope="col">PPM</th>
                                        <th scope="col">RPM</th>
                                        <th scope="col">PDPM</th>
                                        <th scope="col">MPM</th>
                                        <th scope="col">EFF</th>
                                        <th scope="col">FG %</th>
                                        <th scope="col">3P %</th>
                                        <th scope="col">%LF</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>Mark</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                        <td>@mdo</td>
                                        <td>@mdo</td>
                                        <td>@mdo</td>
                                        <td>@mdo</td>
                                        <td>@mdo</td>
                                    </tr>
                                    
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                
            </div>
        </main>
        </body>
      );
    }
  }

  export default Body
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';


function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="ftfilmes-nav-content">
                    <h1>FTFilmes</h1>
                    <a href="https://github.com/gustavolopesk/projetoprofissionalizante">
                        <div className="ftfilme-contact-container">
                            <GithubIcon />
                            <p className="ftfilmes-contact-link">/devGustavo</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default Navbar;
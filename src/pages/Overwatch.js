// import {ToastContainer, toast} from 'react-toastify';
// import 'react-toastify/dist/ReactToastify.css';
import ana from '../resources/images/ana.png';
import ashe from '../resources/images/ashe.png';
// import baptiste from '../resources/images/baptiste.png';
// import bastion from '../resources/images/bastion.png';
// import brigitte from '../resources/images/brigitte.png';
import dva from '../resources/images/dva.png';
import doomfist from '../resources/images/doomfist.png';
import echo from '../resources/images/echo.png';
import genji from '../resources/images/genji.png';
import hanzo from '../resources/images/hanzo.png';
import junkerqueen from '../resources/images/junkerqueen.png';
// import junkrat from '../resources/images/junkrat.png';
import kiriko from '../resources/images/kiriko.png';
// import lucio from '../resources/images/lucio.png';
import mccree from '../resources/images/mccree.png';
import mei from '../resources/images/mei.png';
// import mercy from '../resources/images/mercy.png';
import moira from '../resources/images/moira.png';
// import orisa from '../resources/images/orisa.png';
// import pharah from '../resources/images/pharah.png';
import ramattra from '../resources/images/ramattra.png';
// import reaper from '../resources/images/reaper.png';
// import reinhardt from '../resources/images/reinhardt.png';
// import roadhog from '../resources/images/roadhog.png';
// import sigma from '../resources/images/sigma.png';
import soldier from '../resources/images/soldier.png';
import sombra from '../resources/images/sombra.png';
// import symmetra from '../resources/images/symmetra.png';
import torbjorn from '../resources/images/torbjorn.png';
// import tracer from '../resources/images/tracer.png';
// import widowmaker from '../resources/images/widowmaker.png';
// import winston from '../resources/images/winston.png';
// import wreckingball from '../resources/images/wreckingball.png';
import zarya from '../resources/images/zarya.png';
import zenyatta from '../resources/images/zenyatta.png';

let philipsTanks = [doomfist, junkerqueen, ramattra, zarya]
let philipsDps = [ana, ashe, echo, genji, hanzo, mccree, mei, soldier, sombra, torbjorn]
let philipsSupports = [ana, kiriko, moira, zenyatta]
let philipsHeroes = [philipsTanks, philipsDps, philipsSupports]

const displayPhilipsHeroes = () => {
    clearHeroes()
    setAllHeroes(philipsHeroes)
};

const displayMikeysHeroes = () => {
    clearHeroes()
    let heroesDiv = document.querySelector('.supports');
    let img = document.createElement('img');
    img.setAttribute("class", "hero")
    img.src = moira; // Set the path to your image
    heroesDiv.appendChild(img);
};

const displayKevinsHeroes = () => {
    clearHeroes()
    let heroesDiv = document.querySelector('.tanks');
    let img = document.createElement('img');
    img.setAttribute("class", "hero")
    img.src = dva; // Set the path to your image
    heroesDiv.appendChild(img);
};

const setAllHeroes = (heroPool) => {
    clearHeroes()

    let tanks = heroPool[0]
    let dps = heroPool[1]
    let supports = heroPool[2]

    const tanksDiv = document.querySelector('.tanks');
    const dpsDiv = document.querySelector('.dps');
    const supportsDiv = document.querySelector('.supports');

    tanks.forEach(hero => {
        const img = document.createElement('img');
        img.setAttribute("class", "hero")
        img.src = hero; // Set the path to your image
        tanksDiv.appendChild(img);
    })

    dps.forEach(hero => {
        const img = document.createElement('img');
        img.setAttribute("class", "hero")
        img.src = hero; // Set the path to your image
        dpsDiv.appendChild(img);
    })

    supports.forEach(hero => {
        const img = document.createElement('img');
        img.setAttribute("class", "hero")
        img.src = hero; // Set the path to your image
        supportsDiv.appendChild(img);
    })

}

const clearHeroes = () => {
    const tankDiv = document.querySelector('.tanks');
    const dpsDiv = document.querySelector('.dps');
    const supportDiv = document.querySelector('.supports');
    tankDiv.innerHTML = '';
    dpsDiv.innerHTML = '';
    supportDiv.innerHTML = '';
}



function Overwatch() {
    return (
        <div>
            <div class="heroes">
                <div class="tanksContainer">
                    <h2>Tanks</h2>
                    <div className="tanks">

                    </div>
                </div>
                <div class="dpsContainer">
                    <h2>DPS</h2>
                    <div class="dps">

                    </div>

                </div>
                <div class="supportsContainer">
                    <h2>Supports</h2>
                    <div className="supports">

                    </div>
                </div>
            </div>
            <div class="players">
                <button class="player" onClick={displayPhilipsHeroes}>Philip</button>
                <button class="player" onClick={displayMikeysHeroes}>Mikey</button>
                <button class="player" onClick={displayKevinsHeroes}>Kevin</button>
                {/*<ToastContainer />*/}
            </div>
        </div>
    );
}

export default Overwatch;
import {philipsHeroes} from '../utils/Images.js';
import {mikeysHeroes} from '../utils/Images.js';
import {kevinsHeroes} from '../utils/Images.js';
import {controlMaps} from '../utils/Images.js';

const displayPhilipsHeroes = () => {
    clearHeroes()
    setAllHeroes(philipsHeroes)
};

const displayMikeysHeroes = () => {
    clearHeroes()
    let heroesDiv = document.querySelector('.supports');
    let img = document.createElement('img');
    img.setAttribute("class", "hero")
    img.src = mikeysHeroes.moira; // Set the path to your image
    heroesDiv.appendChild(img);
};

const displayKevinsHeroes = () => {
    clearHeroes()
    let heroesDiv = document.querySelector('.tanks');
    let img = document.createElement('img');
    img.setAttribute("class", "hero")
    img.src = kevinsHeroes.dva; // Set the path to your image
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
        img.src = hero;
        tanksDiv.appendChild(img);
    })

    dps.forEach(hero => {
        const img = document.createElement('img');
        img.setAttribute("class", "hero")
        img.src = hero;
        dpsDiv.appendChild(img);
    })

    supports.forEach(hero => {
        const img = document.createElement('img');
        img.setAttribute("class", "hero")
        img.src = hero;
        supportsDiv.appendChild(img);
    })

    //Formatting
    document.querySelector('.heroes').classList.add('expanded');
}

const clearHeroes = () => {
    const tankDiv = document.querySelector('.tanks');
    const dpsDiv = document.querySelector('.dps');
    const supportDiv = document.querySelector('.supports');
    tankDiv.innerHTML = '';
    dpsDiv.innerHTML = '';
    supportDiv.innerHTML = '';
}

const displayControlMaps = () => {
    const mapsDiv = document.querySelector('.mapSelection');
    mapsDiv.setAttribute('style', 'display: none;');
    const controlMapsDiv = document.querySelector('.maps');
    controlMapsDiv.setAttribute('style', 'display: flex;');
    controlMapsDiv.style.width = "545px"


    controlMaps.forEach(map => {
        const button = document.createElement('button')
        button.addEventListener("click", displayMikeysHeroes);
        button.setAttribute("class", "phantom")

        const img = document.createElement('img');
        img.setAttribute("class", "controlMap")
        img.src = map; // Set the path to your image

        button.appendChild(img)
        controlMapsDiv.appendChild(button);
    })
}

function Overwatch() {
    return (
        <div class="overwatchContainer">
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
            <div class="buttonsTest">
                <div class="buttons">
                    <div class="players">
                        <button class="button-64" onClick={displayPhilipsHeroes}>
                            <span class="text">Philip</span>
                        </button>
                        <button class="button-64" onClick={displayMikeysHeroes}>
                            <span className="text">Mikey</span>
                        </button>
                        <button class="button-64" onClick={displayKevinsHeroes}>
                            <span className="text">KTaco</span>
                        </button>
                    </div>
                    <div class="mapSelection">
                        <button class="button-78" onClick={displayControlMaps}>
                            <span class="text">Control</span>
                        </button>
                        <button class="button-78" onClick={displayMikeysHeroes}>
                            <span className="text">Hybrid</span>
                        </button>
                        <button class="button-78" onClick={displayKevinsHeroes}>
                            <span className="text">Push</span>
                        </button>
                        <button class="button-78" onClick={displayKevinsHeroes}>
                            <span className="text">Escort</span>
                        </button>
                    </div>
                    <div class="maps" style={{display: 'none'}}>

                    </div>
                    <div class="counterHero">
                        <button class="button-46" onClick={displayPhilipsHeroes}>
                            <span class="text">Sombra</span>
                        </button>
                        <button class="button-46" onClick={displayMikeysHeroes}>
                            <span className="text">Pharah</span>
                        </button>
                        <button class="button-46" onClick={displayKevinsHeroes}>
                            <span className="text">Orisa</span>
                        </button>
                        <button class="button-46" onClick={displayKevinsHeroes}>
                            <span className="text">Doomfist</span>
                        </button>
                    </div>
                </div>
                <div class="resetDiv">
                    <button class="button-82-pushable" role="button" onClick={() => window.location.reload()}>
                        <span class="button-82-shadow"></span>
                        <span class="button-82-edge"></span>
                        <span class="button-82-front text">
                                   Reset
                        </span>
                    </button>
                </div>
            </div>
        </div>
    );
}

export default Overwatch;
import React, {useState} from 'react'
import {ClassMap} from '../utils/AwakeningClasses.js'
import {Fathers, Kids, Mothers, StaticParents, UnitMap} from '../utils/AwakeningUnits.js'
import SelectFE from "../components/SelectFE";

let KidsArray = Object.values(Kids);
let FatherArray = Object.values(Fathers);
let MotherArray = Object.values(Mothers);
let ClassList = Object.values(ClassMap);

const TableV1 = () => {
    return (
        <div className="feContainer">
            <table>
                <thead>
                <tr>
                    <th>Kid</th>
                    <th>Parent</th>
                    <th>Class</th>
                    <th>HP</th>
                    <th>Str</th>
                    <th>Mag</th>
                    <th>Skl</th>
                    <th>Spd</th>
                    <th>Lck</th>
                    <th>Def</th>
                    <th>Res</th>
                    <th>Avg</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>{KidsArray[0][0]}</td>
                    <td><SelectFE className={KidsArray[0][0]} list={MotherArray}/></td>
                    <td><SelectFE className={`${KidsArray[0][0]}Classes`} list={ClassList}/></td>
                    {KidsArray[0].slice(1).map((stat, index) => (
                        <td key={KidsArray[0][0]+index}>{stat}</td>
                    ))}
                    <td>
                        {Math.floor(KidsArray[0].slice(1).reduce((acc, curr) => acc + curr, 0) / KidsArray[0].slice(1).length)}
                    </td>
                </tr>
                {KidsArray.slice(1).map((kid, index) => (
                    <tr key={kid[0]+index}>
                        <td>{kid[0]}</td>
                        <td><SelectFE className={kid[0]} list={FatherArray}/></td>
                        <td><SelectFE className={`${kid[0]}Classes`} list={ClassList}/></td>
                        {kid.slice(1).map((stat, index) => (
                            <td key={kid[0]+index}>{stat}</td>
                        ))}
                        <td>
                            {Math.floor(kid.slice(1).reduce((acc, curr) => acc + curr, 0) / kid.slice(1).length)}
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    )
};

function Awakening() {
    return (
        <TableV1/>
    )
}

export default Awakening 
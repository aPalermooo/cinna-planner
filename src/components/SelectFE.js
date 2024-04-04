import React, {useState} from 'react';
import {ClassMap} from '../utils/AwakeningClasses.js'
import {StaticParents, UnitMap} from '../utils/AwakeningUnits.js'

/**
 * Calculate the final growth rates of the kid unit.
 */
function calculateFinalGrowthRates(kidSelection, parentSelection, classSelection) {
    let kidGrowthRates = UnitMap[kidSelection].slice(1)
    let parentGrowthRates = UnitMap[parentSelection].slice(1)
    let staticParentGrowthRates = StaticParents[kidSelection].slice(1)
    let classGrowthRates = ClassMap[classSelection].slice(1)

    const result = [];
    for (let i = 0; i < kidGrowthRates.length; i++) {
        const avg = ((kidGrowthRates[i] + parentGrowthRates[i] + staticParentGrowthRates[i]) / 3) + classGrowthRates[i];
        result.push(Math.floor(avg));
    }
    return result;
}

let updateStats = (kidOrKidClassName) => {
    let kidDiv = document.querySelector(`.${kidOrKidClassName}`)
    let kidRow = kidDiv.closest('tr')
    let allKidCells = Array.from(kidRow.querySelectorAll('td'))

    let kidSelection = allKidCells[0].innerText
    let parentSelection = allKidCells[1].querySelector('select').value
    let classSelection = allKidCells[2].querySelector('select').value

    let finalGrowthRates = calculateFinalGrowthRates(kidSelection, parentSelection, classSelection)
    finalGrowthRates.push(Math.floor(finalGrowthRates.reduce((acc, curr) => acc + curr, 0) / finalGrowthRates.length))

    allKidCells.slice(3).forEach((cell, index) => {
        cell.innerText = finalGrowthRates[index]

        if (Number(cell.innerText) > 50) {
            cell.style.backgroundColor = '#00FF00'
        }
        else if (Number(cell.innerText) < 30) {
            cell.style.backgroundColor = 'red'
        }
        else {
            cell.style.backgroundColor = allKidCells[1].style.backgroundColor
        }
    })
}

let Select = ({ options, onSelect }) => {
    let [selectedValue, setSelectedValue] = useState('');

    let handleChange = (e) => {
        let value = e.target.value;
        setSelectedValue(value);
        onSelect(value);
    };

    return (
        <select value={selectedValue} onChange={handleChange}>
            {options.map((option) => (
                <option key={option.value} value={option.value}>
                    {option.label}
                </option>
            ))}
        </select>
    );
};

let SelectFE = (props) => {
    let dropdownClassName = props.className
    let list = props.list

    let options = []
    list.forEach((option) =>{
        options.push({ label: option[0], value: option[0] })
    })

    let handleSelect = (value) => {
        updateStats(dropdownClassName, value)
    };

    return (
        <div className={dropdownClassName}>
            <Select options={options} onSelect={handleSelect} />
        </div>
    );
};

export default SelectFE;
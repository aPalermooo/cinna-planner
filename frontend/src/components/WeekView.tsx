
function MonthView() {

    const days: readonly string[] = ["Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"];
    const months: readonly string[] = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Oct", "Nov", "Dec"];

    return (
        <>
            <h1> {months.at(0)}</h1>
            <table className="table table-bordered">
                <tbody>
                    <tr>
                        {days.map((day : string) => (
                            <th key={day}> {day} </th>
                        ))}
                    </tr>

                    <tr>
                        {days.map(( _ : string, i : number) => (
                            <td key={i}></td>
                        ))}
                    </tr>
                </tbody>
            </table>
        </>
    )
}

export default MonthView
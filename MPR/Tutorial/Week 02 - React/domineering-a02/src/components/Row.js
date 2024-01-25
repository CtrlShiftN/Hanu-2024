import Button from "./Button";

let Row = (props) => {
    return (
        <tr>
            {Array(props.size).fill(null).map((_, index) => (
                <td key={index}>
                    <Button onClick={props.onClick} className="px-4 py-3" value="&nbsp;&nbsp;" />
                </td>
            ))}
        </tr>
    )
}
export default Row;
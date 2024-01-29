import { useEffect, useState } from "react";
import Row from "./Row";

let Board = ({size}) => {
    let [direction, setDirection] = useState("V");
    let [gameMatrix, setGameMatrix] = useState([]);
    useEffect(() => {
        // let matrix = [];
        // for (let i = 0; i < size; i++) {
        //     matrix[i] = [];
        //     for (let j = 0; j < matrix[i].length; j++) {
        //         matrix[i][j] = null;
        //     }
        // }
        let matrix = Array(size).fill().map(() => Array(size).fill(null));
        setGameMatrix([...matrix]);
    }, [])
    console.log(gameMatrix);
    const renderList = () => {
        let rows = [];
        for (let i = 0; i < size; i++) {
            rows.push(<Row key={i} size={size} />);
        }
        return rows;
    };
    return (
        <div className="container-fluid">
            {renderList()}
        </div>
    )
}
export default Board;
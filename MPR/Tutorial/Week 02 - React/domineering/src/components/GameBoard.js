import { useEffect, useState } from "react";
import Button from "./Button";

let GameBoard = ({ size }) => {
    let [direction, setDirection] = useState("V");
    let [gameMatrix, setGameMatrix] = useState([]);
    let move = () => {
        // TODO
    };
    useEffect(() => {
        let targetArr = [];
        for (let i = 0; i < size; i++) {
            targetArr[i] = [];
            for (let j = 0; j < size; j++) {
                targetArr[i][j] = 0;
            }
        }
        setGameMatrix([...targetArr]);
    }, [direction]);
    console.log(gameMatrix);
    console.log("size", size);
    return (
        <div className="container">
            <table className="table table-responsive">
                {(() => {
                    let rows = [];
                    let count = 0;
                    for (let i = 0; i < size; i++) {
                        rows[i] = [];
                        for (let j = 0; j < size; j++) {
                            rows.push(<td key={count} ></td>);
                            count++;
                        }
                    }
                    return rows;
                })()}
            </table>
        </div>
    );
};
export default GameBoard;

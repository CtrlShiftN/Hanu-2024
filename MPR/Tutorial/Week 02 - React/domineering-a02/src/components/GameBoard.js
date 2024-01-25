import { useEffect, useState } from "react";
import Row from "./Row";

let GameBoard = (props) => {
    let [direction, setDirection] = useState("V");
    let [gameMatrix, setGameMatrix] = useState([]);
    // similar to componentWillMount & componentDidMount
    useEffect(() => {
        let targetArr = [];
        for (let i = 0; i < props.size; i++) {
            targetArr[i] = [];
            for (let j = 0; j < props.size; j++) {
                targetArr[i][j] = null;
            }
        }
        setGameMatrix([...targetArr]);
    }, []);
    let clickHandler = () => {
        console.log(gameMatrix);
    };
    return (
        <table>
            <tbody>
                {Array(props.size)
                    .fill(null)
                    .map((_, index) => (
                        <Row
                            onClick={clickHandler}
                            key={index}
                            size={props.size}
                        />
                    ))}
            </tbody>
        </table>
    );
};
export default GameBoard;

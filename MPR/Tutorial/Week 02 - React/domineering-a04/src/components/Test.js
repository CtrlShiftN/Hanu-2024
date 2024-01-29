import { useState } from "react";

let Test = (props) => {
    let [count, setCount] = useState(1);
    let clickHandler = () => {
        setCount(c => c + 1);
    }
    let clickDesc = () => {
        setCount(c => c - 1);
    }
    return (
        <div className="container">
            <h1>Hello world! - <span className="text-danger">{count}</span></h1>
            <button className={props.className} onClick={clickHandler}>Click me!</button>
            <button className={props.className} onClick={clickDesc}>Click me to desc!</button>
        </div>
    );
};
export default Test;

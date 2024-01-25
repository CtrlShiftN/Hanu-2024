import { useState } from "react";

let Test = ({ name }) => {
    let [age, setAge] = useState(0);

    let increaseAge = () => {
        setAge(age + 1);
    }
    return (
        <div className="container">
            <h1>
                Hello world, {name}! You are {age} years old...
            </h1>
            <button onClick={increaseAge}>Increase my age</button>
        </div>
    );
};
export default Test;

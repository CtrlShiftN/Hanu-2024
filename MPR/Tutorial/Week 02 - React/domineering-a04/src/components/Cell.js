let Cell = () => {
    let clickHandler = () => {
        console.log("you have clicked!");
    }
    return (
        <div onClick={clickHandler} className="d-inline-block p-4  border border-dark"></div>
    );
}
export default Cell;
import Cell from "./Cell";

let Row = ({ size }) => {
    const renderList = () => {
        let row = [];
        for (let i = 0; i < size; i++) {
            row.push(<Cell key={i} />);
        }
        return row;
    };
    return <div className="container">{renderList()}</div>;
};
export default Row;

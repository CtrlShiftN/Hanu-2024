import logo from './logo.svg';
import './App.css';

export default function App({size}) {
  console.log("App-size", size);
  return (
    <Table size={size}/>
  );
}

const Table = ({size}) => {
  console.log("Table-size", size);
  console.log("Type", typeof size);
  return (
    <table>
      <tbody>
        {Array(size)
          .fill(null)
          .map((_, index) => (
            <Row key={index} size={size} />
          ))}
      </tbody>
    </table>
  );
};

const Row = ({size}) => {
  console.log("Row-size", size);
  return (
    <tr>
      {Array(size)
        .fill(null)
        .map((_, index) => (
          <Cell key={index} size={size} />
        ))}
    </tr>
  );
};


const Cell = ({size}) => {
  console.log("Cell-size", size);
  return (
    <td>
      <button size={size} className='px-3 py-4'>&nbsp;&nbsp;</button>
    </td>
  );
};

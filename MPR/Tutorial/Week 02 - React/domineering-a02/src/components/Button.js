let Button = (props) => {
    return (
        <button onClick={props.onClick} className={props.className}>{props.value}</button>
    )
}
export default Button;
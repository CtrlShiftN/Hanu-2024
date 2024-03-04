import { Pressable, Text, StyleSheet } from "react-native";

let PressableButton = (props) => {
    return (
        <Pressable style={[styles.pressableBtn, props.style]} onPress={props.onPress}>
            <Text style={[styles.reloadText, props.textColor]}>{props.text}</Text>
        </Pressable>
    );
};
const styles = StyleSheet.create({
    reloadText: {
        color: "#ffffff",
        textTransform: "uppercase",
        fontWeight: "700",
    },
    pressableBtn: {
        paddingHorizontal: 15,
        paddingVertical: 5,
        borderRadius: 30,
        backgroundColor: '#00693e',
    }
});
export default PressableButton;

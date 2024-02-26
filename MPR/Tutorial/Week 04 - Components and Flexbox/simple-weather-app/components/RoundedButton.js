import { Pressable, Text, StyleSheet } from "react-native";

let RoundedButton = (props) => {
    return (
        <Pressable style={props.style} onPress={props.onPress}>
            <Text style={styles.reloadText}>{props.text}</Text>
        </Pressable>
    );
};
const styles = StyleSheet.create({
    reloadText: {
        color: "#ffffff",
        textTransform: "uppercase",
        fontWeight: "700",
    },
});
export default RoundedButton;

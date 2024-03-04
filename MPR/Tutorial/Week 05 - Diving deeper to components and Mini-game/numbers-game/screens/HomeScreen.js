import { View, StyleSheet, Text } from "react-native";
import PressableButton from "../components/PressableButton";

let HomeScreen = (props) => {
    return (
        <View style={styles.flex}>
            <Text style={styles.heading}>Numbers Game</Text>
            <PressableButton onPress={props.onPress} text="Play"></PressableButton>
        </View>
    )
}
const styles = StyleSheet.create({
    flex: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        gap: 10
    },
    heading: {
        fontSize: 32
    }
});
export default HomeScreen;
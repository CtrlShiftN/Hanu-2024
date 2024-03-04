import { StyleSheet, Text, View } from "react-native";
import PressableButton from "../components/PressableButton";
import Colors from "../contants/color";

let GamePlayScreen = props => {
    return (
        <View style={styles.gamePlayContainer}>
            <Text>{props.randomNumber}</Text>
            <View style={styles.flexRow}>
                <PressableButton style={styles.randomNumberBox} textColor={styles.darkText} text={100}></PressableButton>
                <PressableButton style={styles.randomNumberBox} textColor={styles.darkText} text={100}></PressableButton>
                <PressableButton style={styles.randomNumberBox} textColor={styles.darkText} text={100}></PressableButton>
                <PressableButton style={styles.randomNumberBox} textColor={styles.darkText} text={100}></PressableButton>
                <PressableButton style={styles.randomNumberBox} textColor={styles.darkText} text={100}></PressableButton>
                <PressableButton style={styles.randomNumberBox} textColor={styles.darkText} text={100}></PressableButton>
            </View>
        </View>
    )
}
const styles = StyleSheet.create({
    gamePlayContainer: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    randomNumberBox: {
        backgroundColor: Colors.white,
    },
    darkText: {
        color: Colors.dark,
    },
    flexRow: {
        flexDirection: 'row',
        gap: 5
    }
});
export default GamePlayScreen;
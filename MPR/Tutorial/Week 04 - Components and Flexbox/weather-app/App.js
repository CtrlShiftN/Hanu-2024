import { StatusBar } from "expo-status-bar";
import {
    Text,
    View,
    Image,
    Button,
    StyleSheet,
    Platform,
    ToastAndroid,
    Dimensions,
} from "react-native";

export default function App() {
    const showAlert = () => {
        ToastAndroid.show(
            "A pikachu appeared nearby!",
            ToastAndroid.SHORT,
            ToastAndroid.CENTER
        );
    };
    return (
        <View style={styles.container}>
            <Text style={styles.heading}>Hanoi</Text>
            <Image resizeMode="resize"
                source={require("./assets/media/images/cloudy.png")}
                style={styles.weatherImage}
            />
            <Text style={styles.temperature}>49&deg;C</Text>
            <Text style={styles.desc}>Cloudy</Text>
            <Button
                onPress={() => showAlert()}
                title="Refresh"
                color="#841584"
                accessibilityLabel="Refresh button"
            />
            <StatusBar style="auto" />
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: "center",
        justifyContent: "center",
        ...Platform.select({
            ios: {
                paddingTop: 20,
            },
            android: {
                paddingTop: StatusBar.currentHeight,
            },
        }),
        gap: 10,
    },
    weatherImage: {
        width: Platform.OS === "ios" ? '100%' : "90%",
        resizeMode: 'contain',
    },
    heading: {
        textTransform: "uppercase",
        fontSize: 48,
        fontWeight: "bold",
    },
    temperature: {
        fontSize: 24,
    },
    desc: {
        fontSize: 18,
        fontStyle: "italic",
        // color: "white",
    },
});

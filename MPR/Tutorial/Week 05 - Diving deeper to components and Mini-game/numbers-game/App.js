import { StatusBar } from "expo-status-bar";
import {
    ImageBackground,
    SafeAreaView,
    StyleSheet,
    Text,
    View,
} from "react-native";
import { LinearGradient } from "expo-linear-gradient";
import HomeScreen from "./screens/HomeScreen";
import GamePlayScreen from "./screens/GamePlayScreen";
import { useState } from "react";
import Colors from "./contants/color";

export default function App() {
    const [randomNumber, setRandomNumber] = useState(0);
    let screen = <HomeScreen onPress={generateRandomNumber} />;
    let generateRandomNumber = () => {
        setRandomNumber(12);
    };
    if (randomNumber > 0) {
        screen = <GamePlayScreen randomNumber={randomNumber} />;
    }
    return (
        <LinearGradient
            colors={[Colors.white, Colors.dark]}
            style={styles.rootContainer}
        >
            <ImageBackground
                source={require("./assets/media/images/universe.jpg")}
                resizeMode="cover"
                imageStyle={styles.bgImage}
                style={styles.rootContainer}
            >
                <SafeAreaView style={styles.rootContainer}>
                    {screen}
                </SafeAreaView>
            </ImageBackground>
        </LinearGradient>
    );
}

const styles = StyleSheet.create({
    rootContainer: {
        flex: 1,
    },
    bgImage: {
        opacity: 0.45,
    },
});

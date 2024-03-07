import { StatusBar } from "expo-status-bar";
import {
    Platform,
    SafeAreaView,
    StyleSheet,
    Text,
    TextInput,
    View,
} from "react-native";
import { useState } from "react";
import FontAwesome6 from "react-native-vector-icons/FontAwesome6";
import { useFonts } from "expo-font";
import AppLoading from "expo-app-loading";
import SearchBar from "./components/SearchBar";

export default function App() {
    const [searchPhrase, setSearchPhrase] = useState("");
    const [clicked, setClicked] = useState(false);
    // import font for the app
    const [fontsLoaded] = useFonts({
        "open-sans": require("./assets/fonts/OpenSans-Regular.ttf"),
        "open-sans-bold": require("./assets/fonts/OpenSans-Bold.ttf"),
    });
    // if font not loaded yet, display the loading icon
    if (!fontsLoaded) {
        return <AppLoading />;
    }
    // render
    return (
        <SafeAreaView style={styles.rootContainer}>
			{/* Search bar and buttons */}
            <View style={styles.flexRow}>
                <FontAwesome6 name="arrow-left" size={24} color="#000" />
                <SearchBar
                    searchPhrase={searchPhrase}
                    setSearchPhrase={setSearchPhrase}
                    clicked={clicked}
                    setClicked={setClicked}
					style={styles.searchBar}
					placeholder="Search here..."
                />
                <FontAwesome6 name="gear" size={24} color="#000" />
            </View>
			{/* Avatar and some basic details */}
			<View></View>
            <StatusBar style="auto" />
        </SafeAreaView>
    );
}

const styles = StyleSheet.create({
    rootContainer: {
        ...Platform.select({
            ios: {
                paddingTop: 20,
            },
            android: {
                paddingTop: 40,
            },
        }),
        justifyContent: "flex-start",
        alignItems: "center",
		margin: 20,
		flex: 1
    },
    flexRow: {
        flexDirection: "row",
        justifyContent: "space-between",
		alignItems: "center",
    },
	searchBar: {
		marginHorizontal: 20
	},
});

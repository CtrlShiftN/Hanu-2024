import { StatusBar } from "expo-status-bar";
import {
    StyleSheet,
    Text,
    View,
    Image,
    Button,
    Platform,
    ToastAndroid,
} from "react-native";
// import {useToast} from 'native-base';
import RoundedButton from "./components/RoundedButton";

export default function App() {
    // let toast = useToast();
    let refresh = () => {
        ToastAndroid.show("Refreshed", ToastAndroid.SHORT, ToastAndroid.BOTTOM);
        // toast.show({
        //   description: "Refreshed",
        // })
    };
    return (
        <View style={styles.container}>
            <Text style={styles.heading}>Ha noi</Text>
            <Image
                style={styles.weatherImage}
                source={require("./assets/media/images/cloudy.png")}
            ></Image>
            <Text style={styles.temperature}>32&deg;C</Text>
            <Text style={styles.desc}>cloudy</Text>
            <Button
                onPress={() => refresh()}
                style={styles.refreshBtn}
                title="Refresh"
            ></Button>
            <RoundedButton
                style={styles.reloadBtn}
                onPress={() => refresh()}
                text="Reload"
            ></RoundedButton>
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
                paddingTop: 40,
            },
        }),
        // paddingBottom: Platform.OS === "android" ? 40 : 20,
        gap: 10,
    },
    heading: {
        textTransform: "capitalize",
        fontSize: 32,
        fontWeight: "bold",
    },
    weatherImage: {
        resizeMode: "contain",
        // width: '100%',
        width: "40%",
        height: "20%",
    },
    temperature: {
        fontSize: 32,
    },
    desc: {
        fontSize: 32,
        fontStyle: "italic",
        textTransform: "capitalize",
    },
    reloadBtn: {
        backgroundColor: "#48c3ff",
        borderRadius: 40,
        paddingVertical: 10,
        paddingHorizontal: 20,
    },
});

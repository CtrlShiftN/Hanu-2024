import {
    Keyboard,
    SafeAreaView,
    StyleSheet,
    TextInput,
    View,
} from "react-native";
import FontAwesome6 from "react-native-vector-icons/FontAwesome6";
import Colors from "../constants/colors";

let SearchBar = (props) => {
    return (
        <View style={[styles.searchBarContainer, props.style]}>
            <FontAwesome6
                name="magnifying-glass"
                size={24}
                brand
                color={Colors.secondary}
                style={styles.searchBarIcon}
            />
            <TextInput
                placeholder={props.placeholder}
                style={styles.searchBarInput}
                value={props.searchPhrase}
                onChangeText={props.setSearchPhrase}
                onFocus={() => {
                    props.setClicked(true);
                }}
                placeholderTextColor={Colors.lightGray}
                // autoCapitalize="none"
                // autoComplete="off"
                // editable
                // inputMode="text"
                // keyboardType="default"
                // maxLength={50}
                // keyboardAppearance="default"
            />
            {props.clicked && (
                <FontAwesome6
                    name="x"
                    size={15}
                    color={Colors.dark}
                    style={styles.searchBarReset}
                    onPress={() => {
                        props.setSearchPhrase("");
                        Keyboard.dismiss();
                        props.setClicked(false);
                    }}
                />
            )}
        </View>
    );
};
const styles = StyleSheet.create({
    searchBarContainer: {
        flexDirection: "row",
        alignItems: "center",
        paddingHorizontal: 10,
        backgroundColor: "#eee",
        borderRadius: 30,
        flex: 1,
    },
    searchBarIcon: {
        marginRight: 10,
    },
    searchBarInput: {
        flex: 1,
        paddingVertical: 10,
    },
    searchBarReset: {
        marginEnd: 5,
    },
});
export default SearchBar;

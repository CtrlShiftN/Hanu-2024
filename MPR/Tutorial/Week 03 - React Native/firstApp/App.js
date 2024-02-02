import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.heading}>User Information</Text>
      <Text>Full name:  John Doe</Text>
      {/* <StatusBar style="auto" /> */}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    paddingStart: 20,
    paddingTop: 10
    // alignItems: 'center',
    // justifyContent: 'center',
  },
  textCenter: {
    textAlign: 'center',
  },
  heading: {
    fontSize: 40,
    fontWeight: "800",
    textAlign: 'center',
  },
});

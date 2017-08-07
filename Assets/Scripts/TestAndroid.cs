using UnityEngine;
using System.Runtime.InteropServices;
using UnityEngine.UI;

public class TestAndroid : MonoBehaviour {

	public Text label;

	public void OnClick() {  
		AndroidJavaClass jc = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
		AndroidJavaObject jo = jc.GetStatic<AndroidJavaObject>("currentActivity");
		string[] str = new string[2] {
			"HelloWorld",
			"Show Android Dialog!"
		};  
		string ret = jo.Call<string>("ShowDialog", str);
		label.text = ret;
	}


}
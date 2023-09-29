import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Testing\\Desktop\\katalon\\Apk actualizada Android 13\\app-qa.apk', true)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.TextView - Omitir'), 0)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.TextView - Iniciar sesin'), 0)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.EditText - Apodo'), 0)

Mobile.setText(findTestObject('Object Repository/Test_/android.widget.EditText - Apodo (1)'), 'edwin_1324', 0)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.Button - Recuperar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

for (int i = 1; i <= 5; i++) {
    // Espera a que el RadioGroup esté presente (debes adaptar este objeto de prueba)
    if (Mobile.waitForElementPresent(findTestObject('Object Repository/Test_/android.widget.RadioGroup'), 2)) {
        // Si el RadioGroup está presente, verifica si la opción "Uno" está disponible
        if (Mobile.waitForElementPresent(findTestObject('Object Repository/Test_/android.widget.RadioButton - Uno'), 2)) {
            // Si la opción "Uno" está presente, selecciónala
            Mobile.tap(findTestObject('Object Repository/Test_/android.widget.RadioButton - Uno'), 2 // Si la opción "Dos" está presente, selecciónala
                // Si la opción "Tres" está presente, selecciónala
                ) // Si ninguna opción está presente, realiza otra acción o muestra un mensaje
        } else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Test_/android.widget.RadioButton - Dos'), 
            10)) {
            Mobile.tap(findTestObject('Object Repository/Test_/android.widget.RadioButton - Dos'), 2)
        } else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Test_/android.widget.RadioButton - Tres'), 
            10)) {
            Mobile.tap(findTestObject('Object Repository/Test_/android.widget.RadioButton - Tres'), 2)
        } else {
            Mobile.tap(findTestObject('Test_/android.widget.RadioButton - No eleg esta pregunta'), 0)
        }
        
        // Toca el botón "Siguiente"
     //   Mobile.tap(findTestObject('Test_/android.widget.Button - Siguiente'), 0) // Si el RadioGroup no está presente, muestra un mensaje de error
            
		
		if (Mobile.waitForElementPresent(findTestObject('Test_/android.widget.Button - Siguiente'), 2)) {
			Mobile.tap(findTestObject('Test_/android.widget.Button - Siguiente'), 0)
		} else {
			Mobile.tap(findTestObject('Test_/android.widget.Button - Finalizar'), 0)
		}
		
    }
}



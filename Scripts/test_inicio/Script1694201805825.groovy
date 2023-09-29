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
	// Definir el objeto de prueba para el RadioGroup
	TestObject radioGroupObject = findTestObject('Object Repository/Test_/android.widget.RadioGroup')

	// Definir los objetos de prueba para las opciones Uno, Dos y Tres
	TestObject optionUnoObject = findTestObject('Object Repository/Test_/android.widget.RadioButton - Uno')
	TestObject optionDosObject = findTestObject('Object Repository/Test_/android.widget.RadioButton - Dos')
	TestObject optionTresObject = findTestObject('Object Repository/Test_/android.widget.RadioButton - Tres')

	// Definir el objeto de prueba para el botón "Siguiente"
	TestObject siguienteButton = findTestObject('Test_/android.widget.Button - Siguiente')

	// Esperar a que el RadioGroup esté presente
	if (Mobile.waitForElementPresent(radioGroupObject, 2)) {
		// Si el RadioGroup está presente, verificar y seleccionar opciones
		if (Mobile.waitForElementPresent(optionUnoObject, 2)) {
			Mobile.tap(optionUnoObject, 2)
		} else if (Mobile.waitForElementPresent(optionDosObject, 2)) {
			Mobile.tap(optionDosObject, 2)
		} else if (Mobile.waitForElementPresent(optionTresObject, 2)) {
			Mobile.tap(optionTresObject, 2)
		} else {
			// Si ninguna opción está presente, realiza otra acción o muestra un mensaje
			Mobile.tap(findTestObject('Test_/android.widget.RadioButton - No eleg esta pregunta'), 0)
		}
		
		// Tocar el botón "Siguiente" o "Finalizar" según la situación
		if (Mobile.waitForElementPresent(siguienteButton, 2)) {
			Mobile.tap(siguienteButton, 0)
		} else {
			Mobile.tap(findTestObject('Test_/android.widget.Button - Finalizar'), 0)
		}
	}
}

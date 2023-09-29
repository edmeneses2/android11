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

int i = 1

while (i <= 5) {
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
            Mobile.tap(optionUnoObject, 2) // Si ninguna opción está presente, realiza otra acción o muestra un mensaje
        } else if (Mobile.waitForElementPresent(optionDosObject, 2)) {
            Mobile.tap(optionDosObject, 2)
        } else if (Mobile.waitForElementPresent(optionTresObject, 2)) {
            Mobile.tap(optionTresObject, 2)
        } else {
            Mobile.tap(findTestObject('Test_/android.widget.RadioButton - No eleg esta pregunta'), 0)
        }
        
        // Tocar el botón "Siguiente" o "Finalizar" según la situación
        if (Mobile.waitForElementPresent(siguienteButton, 2)) {
            Mobile.tap(siguienteButton, 0)
        } else {
            Mobile.tap(findTestObject('Test_/android.widget.Button - Finalizar'), 0)
        }
        
        i++ // Incrementar la variable de control
    }
}

Mobile.startApplication('C:\\Users\\Testing\\Desktop\\katalon\\Apk actualizada Android 13\\app-qa.apk', true)

Mobile.verifyElementVisible(findTestObject('Object Repository/Test_/android.widget.TextView - Tu cuenta ha sido recuperada. Gracias por recuperar tu cuenta, ahora puedes chatear de forma privada y segura con tus contactos'), 
    0)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.Button - Cerrar'), 0)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.EditText - Pin de Acceso'), 0)

Mobile.setText(findTestObject('Object Repository/Test_/android.widget.EditText - Pin de Acceso (1)'), '0000', 0)

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.EditText - Confirmar nuevo pin de acceso'), 0)

Mobile.setText(findTestObject('Object Repository/Test_/android.widget.EditText - Confirmar nuevo pin de acceso (1)'), '0000', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Test_/android.widget.Button - Recuperar cuenta'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)


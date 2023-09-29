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

Mobile.startApplication('C:\\Users\\Testing\\Desktop\\katalon\\app-release.apk', true)

Mobile.verifyElementVisible(findTestObject('Crear Usuario Nuevo/androidx.drawerlayout.widget.DrawerLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.Button - Crear Cuenta (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Crear Usuario Nuevo/androidx.drawerlayout.widget.DrawerLayout (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.Button - Enviar cdigo de registro'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.LinearLayout (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.TextView - Ingresar cdigo'), 
    'Ingresar código')

Mobile.tap(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.Button - Continuar'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Crear Usuario Nuevo/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.Button - Siguiente'), 0)

Mobile.setText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - Apodo'), 'holamundo', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.TextView - El apodo debe contener al menos un nmero'), 
    'El apodo debe contener al menos un número')

Mobile.clearText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - holamundo'), 0)

Mobile.setText(findTestObject('Crear Usuario Nuevo/android.widget.EditText - Apodo'), '123456', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.TextView - El Apodo debe comenzar con una letra'), 
    'El Apodo debe comenzar con una letra')

Mobile.clearText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - 123456'), 0)

Mobile.setText(findTestObject('Crear Usuario Nuevo/android.widget.EditText - Apodo'), 'elpromax11', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.TextView - Apodo no disponible'), 
    'Apodo no disponible')

Mobile.clearText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - elpromax11'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.TextView - El Apodo es obligatorio'), 
    'El Apodo es obligatorio')

Mobile.setText(findTestObject('Crear Usuario Nuevo/android.widget.EditText - Apodo'), 'libre0123', 0)

Mobile.setText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - Nombre a mostrar (opcional)'), 
    'opcional', 0)

Mobile.tap(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.Button - Siguiente (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - Pin de Acceso'), '0000', 
    0)

Mobile.setText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - Confirmar nuevo pin de acceso (1)'), 
    '000', 0)

Mobile.clearText(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.EditText - 000'), 0)

Mobile.setText(findTestObject('Crear Usuario Nuevo/android.widget.EditText - Confirmar nuevo pin de acceso (1)'), '0000', 
    0)

Mobile.tap(findTestObject('Object Repository/Crear Usuario Nuevo/android.widget.Button - Crear Cuenta (2)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - OK (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/tutorial y preguntas/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - OK (3)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/tutorial y preguntas/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - OK (4)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/tutorial y preguntas/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - OK (5)'), 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Registrar'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Elige una pregunta'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Qu queras ser de pequeo'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.setText(findTestObject('Object Repository/tutorial y preguntas/android.widget.EditText - Respuesta'), 'text', 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.setText(findTestObject('tutorial y preguntas/android.widget.EditText - Respuesta (1)'), 'text', 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.TextView - Elige una pregunta'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Cul es tu marca de ropa favorita'), 
    0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Elige una pregunta (1)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Dnde conoci a su pareja'), 0)

Mobile.setText(findTestObject('Object Repository/tutorial y preguntas/android.widget.EditText - Respuesta (2)'), 'text', 
    0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Finalizar'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Cancelar'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Confirmar'), 0)


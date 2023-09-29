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

Mobile.tap(findTestObject('VerFotoPerfil/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/VerFotoPerfil/android.view.ViewGroup'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/VerFotoPerfil/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/VerFotoPerfil/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/androidx.appcompat.widget.LinearLayoutCompat'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfil/android.widget.ImageButton (3)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/CambiarFotoPerfilGaleria/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/FotoPerfilXDefecto/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/FotoPerfilXDefecto/android.widget.LinearLayout'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('FotoPerfilXDefecto/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('FotoPerfilXDefecto/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/FotoPerfilXDefecto/android.widget.Button - Aceptar'), 0)

Mobile.tap(findTestObject('Object Repository/FotoPerfilXDefecto/android.widget.ImageView'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/EditarPerfilNombre/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/EditarPerfilNombre/android.widget.EditText'), 'prueba', 0)

Mobile.tap(findTestObject('Object Repository/EditarPerfilNombre/android.widget.Button - Aceptar'), 0)

Mobile.tap(findTestObject('Object Repository/EditarEstadoPerfil/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/EditarEstadoPerfil/android.widget.EditText - Disponible'), 'set pruebas', 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/EditarEstadoPerfil/android.widget.EditText - set pruebas'), 'set pruebas')

Mobile.tap(findTestObject('Object Repository/EditarEstadoPerfil/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/EstadoSeleccionado/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/EstadoSeleccionado/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/EstadoSeleccionado/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/VerUsrBoqueadosPerfil/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/VerUsrBoqueadosPerfil/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/CerrarSesionPerfilNo/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/CerrarSesionPerfilNo/android.widget.Button - No Cerrar Sesin'), 0)

Mobile.tap(findTestObject('Object Repository/CerrarSesionPerfilNo/android.widget.ImageButton'), 0)


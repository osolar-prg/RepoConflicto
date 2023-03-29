/*
 * Copyright 2022 José A. Pacheco Ondoño - japolabs@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Properties;
import org.japo.java.libraries.UtilesApp;
import org.japo.java.libraries.UtilesConfig;

/**
 *
 * @author José A. Pacheco Ondoño - japolabs@gmail.com
 */
public final class App {

    // Propiedades del Sistema
    private final Properties prp;

    public App(Properties prp) {
        this.prp = prp;
    }

    // Logica de Negocio
    public final void launchApp() {
        // Propiedades Pantalla
        System.out.println("PROPIEDADES DE USUARIO");
        System.out.println("======================");
        System.out.printf("Máquina ..: %s%n", prp.getProperty(UtilesConfig.PRP_MAQ, UtilesConfig.DEF_MAQ));
        System.out.printf("Puerto ...: %s%n", prp.getProperty(UtilesConfig.PRP_PUE));
        System.out.printf("Usuario ..: %s%n", prp.getProperty(UtilesConfig.PRP_USR));
        System.out.printf("Password .: %s%n", prp.getProperty(UtilesConfig.PRP_PSS));
    }
}

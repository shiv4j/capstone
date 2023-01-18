/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.capstone.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_footer = null;
_global_footer = renderContext.call("use", com.alchemy.capstone.core.models.FooterModel.class.getName(), obj());
out.write("\n<div class=\"container-fluid fh5co_footer_bg pb-3\">\n    <div class=\"container animate-box\">\n        <div class=\"row\">\n            <div class=\"col-12 spdp_right py-5\"><img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_footer, "footerLogo");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"img\" class=\"footer_logo\"/></div>\n            <div class=\"clearfix\"></div>\n            <div class=\"col-md-12\">\n                <div class=\"footer_main_title py-3\"> </div>\n                <div class=\"footer_sub_about pb-3\">");
{
    String var_4 = ((" \n\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "aboutText"), "html"))) + " \n                ");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</div>\n                <div class=\"footer_mediya_icon\">\n                    <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n                        <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-linkedin\"></i></div>\n                    </a></div>\n                    <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n                        <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-google-plus\"></i></div>\n                    </a></div>\n                    <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n                        <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-twitter\"></i></div>\n                    </a></div>\n                    <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n                        <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-facebook\"></i></div>\n                    </a></div>\n                </div>\n            </div>\n         </div>\n     </div>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


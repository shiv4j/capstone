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
package org.apache.sling.scripting.sightly.apps.capstone.components.header__002d__primary;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002d__primary__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_pheader = null;
_global_pheader = renderContext.call("use", com.alchemy.capstone.core.models.HeaderPrimaryModel.class.getName(), obj());
out.write("\n<div class=\"container-fluid fh5co_header_bg\">\n    <div class=\"container\">\n        <div class=\"row\">\n            <div class=\"col-12 fh5co_mediya_center\"><a href=\"https://technext.github.io/24-news/blog.html#\" class=\"color_fff fh5co_mediya_setting\"><i class=\"fa fa-clock-o\"></i>");
{
    String var_0 = ("&nbsp;&nbsp;&nbsp;" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_pheader, "todayDate"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</a>\n                <div class=\"d-inline-block fh5co_trading_posotion_relative\">\n\t\t\t\t<a href=\"#\" class=\"treding_btn\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_pheader, "trendingText"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</a>\n                    <div class=\"fh5co_treding_position_absolute\"></div>\n                </div>\n                <a href=\"#\" class=\"color_fff fh5co_mediya_setting\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_pheader, "trendingDesc"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</a>\n            </div>\n        </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


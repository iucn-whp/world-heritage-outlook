package com.iucn.whp.sites.portlet;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;

public class exportUtil{


	public static void exportData(ResourceRequest resourceRequest, ResourceResponse resourceResponse){

		/*String filename="";
		String searchText = "";
		String filePath="C:\\folder\\myfile.xls";*/
	//	String whpSiteIds = resourceRequest.getParameter("siteID");
		
		try {
			String strWhp_sites=resourceRequest.getParameter("whp_sitesList");
			String[] whp_sites=strWhp_sites.split(",");
			List<whp_sites> tempResults =new ArrayList<whp_sites>();
			
			for(int k=0;k<whp_sites.length;k++){
				whp_sites temwhp_sites=whp_sitesLocalServiceUtil.getSiteBySiteId(Long.parseLong(whp_sites[k]));
				tempResults.add(temwhp_sites);
			}
			//List<whp_sites> tempResults = (List<whp_sites>) resourceRequest.getPortletSession().getAttribute("whp_sitesList");

			HSSFWorkbook hwb = new HSSFWorkbook();
			HSSFSheet sheet = hwb.createSheet("Site Information");
			// Create a new font and alter it.
			org.apache.poi.ss.usermodel.Font font = hwb.createFont();
			font.setFontHeightInPoints((short)11);
			font.setFontName("Arial");
			font.setItalic(false);
			font.setStrikeout(false);
			font.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);
			CellStyle style = hwb.createCellStyle();

			style.setBorderBottom(CellStyle.BORDER_THIN);
			style.setBorderLeft(CellStyle.BORDER_THIN);
			style.setBorderTop(CellStyle.BORDER_THIN);
			style.setBorderRight(CellStyle.BORDER_THIN);

			style.setBorderBottom(CellStyle.BORDER_THIN);
			style.setBottomBorderColor(HSSFColor.BLACK.index);
			style.setFont(font);

			/* creating the cell style for the filter values */
			CellStyle filterStyle = hwb.createCellStyle();

			org.apache.poi.ss.usermodel.Font filterfont = hwb.createFont();
			filterfont.setFontHeightInPoints((short) 9);
			filterfont.setFontName("Courier New");
			//filterStyle.setFillBackgroundColor();
			filterfont.setItalic(false);
			filterfont.setStrikeout(false);
			filterfont.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);
			filterStyle.setFont(filterfont);

			filterStyle.setBorderBottom(CellStyle.BORDER_THIN);
			filterStyle.setBorderLeft(CellStyle.BORDER_THIN);
			filterStyle.setBorderTop(CellStyle.BORDER_THIN);
			filterStyle.setBorderRight(CellStyle.BORDER_THIN);
			HSSFRow rowhead = sheet.createRow((short) 2);
			rowhead.createCell((short) 0).setCellValue("sno");
			rowhead.createCell((short) 1).setCellValue("UNESCO ID");
			rowhead.createCell((short) 2).setCellValue("WDPAID ID");
			rowhead.createCell((short) 3).setCellValue("Site name EN");
			rowhead.createCell((short) 4).setCellValue("Site name FR");
			rowhead.createCell((short) 5).setCellValue("Country (Name of multiple countries will be provided as a comma separated list)");
			rowhead.createCell((short) 6).setCellValue("Transboundary");
			rowhead.createCell((short) 7).setCellValue("Inscription criteria(Multiple values will be provided as a comma separated list)");
			rowhead.createCell((short) 8).setCellValue("Inscription Year");
			rowhead.createCell((short) 9).setCellValue("Mixed site");
			rowhead.createCell((short) 10).setCellValue("Cultural landscape");
			rowhead.createCell((short) 11).setCellValue("Danger List (Latest Y/N value will be provided)");
			rowhead.createCell((short) 12).setCellValue("Reinforced Monitoring");
			rowhead.createCell((short) 13).setCellValue("Area");
			rowhead.createCell((short) 14).setCellValue("Buffer zone");
			rowhead.createCell((short) 15).setCellValue("Buffer zone area");
			rowhead.createCell((short) 16).setCellValue("Boundary modifications (Latest Y/N flag will be provided)");
			rowhead.createCell((short) 17).setCellValue("Components(Multiple components names will be provided as a comma separated list)");
			rowhead.createCell((short) 18).setCellValue("Serial");
			rowhead.createCell((short) 19).setCellValue("SoOUV (Y/N flag will be displayed)");
			rowhead.createCell((short) 20).setCellValue("Management plan(Y/N flag will be displayed)");
			rowhead.createCell((short) 21).setCellValue("Staff");
			rowhead.createCell((short) 22).setCellValue("Budget(Values of latest budget attributes will be displayed in separate columns)");
			rowhead.createCell((short) 23).setCellValue("Visitors");
			rowhead.createCell((short) 24).setCellValue("Indigenous communities(Y/N flag will be displayed)");
			rowhead.createCell((short) 25).setCellValue("Population");
			rowhead.createCell((short) 26).setCellValue("Last updated");


			int index = 3;
			int sno = 0;
			String name = "";
		//	String[] arrWhpSiteId = whpSiteIds.split(",");
			for(int i=0;i<tempResults.size();i++)
			
			{
						
				sno++;
				whp_sites objwhp_sites = whp_sitesLocalServiceUtil.getSiteBySiteId(tempResults.get(i).getSite_id());
				
				 List<country_lkp> lstCountry = lstCountry=whp_sitesLocalServiceUtil.getCountryListBySiteId(objwhp_sites.getSite_id());
			       String countriesName="";
			        if(lstCountry!=null && lstCountry.size()>0){
			        	for(int a=0;a<lstCountry.size();a++){
			        		country_lkp tempcountry_lkp=lstCountry.get(a);
			        		if(countriesName!="")
			            		countriesName=countriesName+", "+tempcountry_lkp.getName();
			            	else
			            		countriesName=tempcountry_lkp.getName();
			        	}
			        	
			        }
				
				
				
				HSSFRow row = sheet.createRow((short) index);
				row.createCell((short) 0).setCellValue(sno);
				row.createCell((short) 1).setCellValue(Long.toString(objwhp_sites.getUnesco_id()));
				row.createCell((short) 2).setCellValue(Long.toString(objwhp_sites.getWdpa_id()));
				row.createCell((short) 3).setCellValue(objwhp_sites.getName_en());
				row.createCell((short) 4).setCellValue(objwhp_sites.getName_fr());
				row.createCell((short) 5).setCellValue(countriesName);
				row.createCell((short) 6).setCellValue(Boolean.toString(objwhp_sites.getTransboundary()));
				row.createCell((short) 7).setCellValue("");
				row.createCell((short) 8).setCellValue(objwhp_sites.getInscription_date().toString().substring(23));
				row.createCell((short) 9).setCellValue(Boolean.toString(objwhp_sites.getMixed_site()));
				row.createCell((short) 10).setCellValue(Boolean.toString(objwhp_sites.getCultural_landscape()));
				row.createCell((short) 11).setCellValue(Boolean.toString(objwhp_sites.getDanger_list()));
				row.createCell((short) 12).setCellValue("");
				row.createCell((short) 13).setCellValue(Double.toString(objwhp_sites.getArea()));
				row.createCell((short) 14).setCellValue(Boolean.toString(objwhp_sites.getBuffer_zone()));
				row.createCell((short) 15).setCellValue(Double.toString(objwhp_sites.getBuffer_zone_area()));
				row.createCell((short) 16).setCellValue("");
				row.createCell((short) 17).setCellValue(Boolean.toString(objwhp_sites.getBoundary_modification()));
				row.createCell((short) 18).setCellValue(Boolean.toString(objwhp_sites.getSerial()));
				row.createCell((short) 19).setCellValue(Boolean.toString(objwhp_sites.getSoouv()));
				row.createCell((short) 20).setCellValue(Boolean.toString(objwhp_sites.getManagement_plan()));
				row.createCell((short) 21).setCellValue(Long.toString(objwhp_sites.getStaff()));
				row.createCell((short) 22).setCellValue("");
				row.createCell((short) 23).setCellValue("");
				row.createCell((short) 24).setCellValue(Boolean.toString(objwhp_sites.getIndigenous_communities()));
				row.createCell((short) 25).setCellValue(Long.toString(objwhp_sites.getPopulation()));
				row.createCell((short) 26).setCellValue(objwhp_sites.getLast_updated().toString());
				

				index++;

			}
			
			resourceResponse.setContentType("application/vnd.ms-excel");
			resourceResponse.addProperty("Content-Disposition", "attachment;filename=SiteInfoDetails.xls");
			OutputStream fileOut = resourceResponse.getPortletOutputStream();
			hwb.write(fileOut);
			fileOut.close();
			
			


		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	



}

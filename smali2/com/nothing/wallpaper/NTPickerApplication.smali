.class public final Lcom/nothing/wallpaper/NTPickerApplication;
.super Landroid/app/Application;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/NTPickerApplication$a;
    }
.end annotation


# static fields
.field public static final q:Lcom/nothing/wallpaper/NTPickerApplication$a;

.field private static r:Landroid/app/Application;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/NTPickerApplication$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/NTPickerApplication$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroid/app/Application;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->r:Landroid/app/Application;

    return-object v0
.end method

.method public static final synthetic b(Landroid/app/Application;)V
    .registers 1

    sput-object p0, Lcom/nothing/wallpaper/NTPickerApplication;->r:Landroid/app/Application;

    return-void
.end method

.method public static final c()Landroid/app/Application;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onCreate()V
    .registers 3

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    const-string v0, "NTPickerApplication"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->b(Landroid/app/Application;)V

    return-void
.end method

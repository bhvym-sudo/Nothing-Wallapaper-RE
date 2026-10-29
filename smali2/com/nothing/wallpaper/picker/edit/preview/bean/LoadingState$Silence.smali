.class public final Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;
.super Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Silence"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;-><init>(Lkotlin/jvm/internal/h;)V

    return-void
.end method

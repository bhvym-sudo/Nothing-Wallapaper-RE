.class public final Lcom/nothing/launcher/card/u;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/launcher/card/u$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/nothing/launcher/card/u$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/launcher/card/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/launcher/card/u$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/launcher/card/u;->a:Lcom/nothing/launcher/card/u$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public getPackageName()Ljava/lang/String;
    .registers 1

    const-string p0, "com.android.systemui"

    return-object p0
.end method

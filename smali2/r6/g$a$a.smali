.class public final Lr6/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH3/C$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr6/g$a;->a(Landroid/content/ComponentName;Landroid/view/View;Landroid/content/Context;ILv8/a;)Lr6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lv8/a;


# direct methods
.method constructor <init>(Lv8/a;)V
    .registers 2

    iput-object p1, p0, Lr6/g$a$a;->q:Lv8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .registers 1

    iget-object p0, p0, Lr6/g$a$a;->q:Lv8/a;

    if-eqz p0, :cond_7

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_7
    return-void
.end method

.class public final synthetic Lh7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/a;->q:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Lh7/a;->q:Landroid/content/Context;

    check-cast p1, Landroid/view/View;

    invoke-static {p0, p1}, Lh7/b;->b(Landroid/content/Context;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

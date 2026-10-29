.class public final synthetic LQ6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ6/a;->q:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LQ6/a;->q:Landroid/view/View;

    check-cast p1, Landroid/view/View;

    check-cast p2, Lb2/a;

    invoke-static {p0, p1, p2}, LQ6/c;->a(Landroid/view/View;Landroid/view/View;Lb2/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

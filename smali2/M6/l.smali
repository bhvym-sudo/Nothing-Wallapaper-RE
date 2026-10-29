.class public final synthetic LM6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lg3/x;

.field public final synthetic r:LM6/k$d;


# direct methods
.method public synthetic constructor <init>(Lg3/x;LM6/k$d;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/l;->q:Lg3/x;

    iput-object p2, p0, LM6/l;->r:LM6/k$d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LM6/l;->q:Lg3/x;

    iget-object p0, p0, LM6/l;->r:LM6/k$d;

    invoke-static {v0, p0, p1}, LM6/k$d;->g(Lg3/x;LM6/k$d;Landroid/view/View;)V

    return-void
.end method

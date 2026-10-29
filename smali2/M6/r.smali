.class public final synthetic LM6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LM6/u;

.field public final synthetic r:Lg3/x;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(LM6/u;Lg3/x;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/r;->q:LM6/u;

    iput-object p2, p0, LM6/r;->r:Lg3/x;

    iput-boolean p3, p0, LM6/r;->s:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget-object v0, p0, LM6/r;->q:LM6/u;

    iget-object v1, p0, LM6/r;->r:Lg3/x;

    iget-boolean p0, p0, LM6/r;->s:Z

    invoke-static {v0, v1, p0, p1}, LM6/u;->g(LM6/u;Lg3/x;ZLandroid/view/View;)V

    return-void
.end method

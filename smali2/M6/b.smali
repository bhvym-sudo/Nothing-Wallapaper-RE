.class public final synthetic LM6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LM6/c$a;


# direct methods
.method public synthetic constructor <init>(LM6/c$a;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/b;->q:LM6/c$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, LM6/b;->q:LM6/c$a;

    invoke-static {p0, p1}, LM6/c$a;->d(LM6/c$a;Landroid/view/View;)V

    return-void
.end method

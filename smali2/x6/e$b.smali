.class public final Lx6/e$b;
.super Le9/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx6/e;->W(Ljava/lang/String;)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private r:Z

.field final synthetic s:Lz6/b$d;


# direct methods
.method constructor <init>(Lz6/b$d;Le9/B;)V
    .registers 3

    iput-object p1, p0, Lx6/e$b;->s:Lz6/b$d;

    invoke-direct {p0, p2}, Le9/j;-><init>(Le9/B;)V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    invoke-super {p0}, Le9/j;->close()V

    iget-boolean v0, p0, Lx6/e$b;->r:Z

    if-nez v0, :cond_f

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx6/e$b;->r:Z

    iget-object p0, p0, Lx6/e$b;->s:Lz6/b$d;

    invoke-virtual {p0}, Lz6/b$d;->close()V

    :cond_f
    return-void
.end method
